package com.jesil.exmaple.custom.placeholder.utils

data class Resources<out T>(val status: Status, val data: T?, val message: String?) {
    companion object{
        fun <T> success(data : T?): Resources<T>{
            return Resources(Status.SUCCESS, data, message = null)
        }
        fun <T> error(data : T?,message: String): Resources<T>{
            return Resources(Status.ERROR, data, message)
        }
        fun <T> loading(data: T?): Resources<T>{
            return Resources(Status.LOADING, data, null)
        }
    }
}