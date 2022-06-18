package com.example.cryptocurrency.common

/**
 * Created by quangnh
 * Date: 16/6/2022
 * Time: 4:15 PM
 * Project Cryptocurrency
 */
sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
    class Loading<T>(data: T? = null) : Resource<T>(data)
}