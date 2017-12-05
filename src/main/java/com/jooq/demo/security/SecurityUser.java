package com.jooq.demo.security;

import com.google.common.collect.Sets;
import com.jooq.demo.domain.tables.pojos.Role;
import com.jooq.demo.domain.tables.pojos.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * @author ellien
 * @package com.jooq.demo.security
 * @date 2017/12/03 21:11
 */
public class SecurityUser implements UserDetails {

    private Integer id;
    private String username;
    private String  password;
    private List<Role>  roles;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public SecurityUser(User user, List<Role> roles) {
        if (user != null) {
            this.id = user.getId();
            this.username = user.getUsername();
            this.password = user.getPassword();
            this.roles = roles;
        }
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<GrantedAuthority> authorities = Sets.newConcurrentHashSet();
        if (!roles.isEmpty()) {
            roles.forEach(role -> authorities.add(new SimpleGrantedAuthority(role.getRoleName())));
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
