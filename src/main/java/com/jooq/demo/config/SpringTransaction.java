package com.jooq.demo.config;

import org.jooq.Transaction;
import org.springframework.transaction.TransactionStatus;

/**
 * @author ellien
 * @package com.jooq.demo.config
 * @date 2017/11/29 15:08
 */
public class SpringTransaction implements Transaction {

    private final TransactionStatus transactionStatus;

    SpringTransaction(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
    public TransactionStatus getTxStatus() {
        return this.transactionStatus;
    }

}
