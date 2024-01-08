package com.walletconnect.web3.modal.client.models.request

data class Request(
    val method: String,
    val params: String,
    val expiry: Long? = null,
)