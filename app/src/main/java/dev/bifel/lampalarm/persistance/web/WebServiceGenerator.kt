package dev.bifel.lampalarm.persistance.web

import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.experimental.CoroutineCallAdapterFactory
import dev.bifel.lampalarm.global.BASE_URL
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Date: 05.10.2019
 * Time: 3:21
 *
 * @author Bohdan Ishchenko
 */

class WebServiceGenerator {

    fun <T> createService(serviceClass: Class<T>): T {
        val httpClient = OkHttpClient.Builder()
        val gson = GsonBuilder().setLenient().create()
        val builder = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(gson))

        httpClient.connectTimeout(30, TimeUnit.SECONDS)
        builder.client(httpClient.build())

        return builder.build().create(serviceClass)
    }
}