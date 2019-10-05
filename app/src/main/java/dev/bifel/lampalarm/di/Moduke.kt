package dev.bifel.lampalarm.di

import dev.bifel.lampalarm.persistance.repository.Repository
import dev.bifel.lampalarm.persistance.source.RoomDataSource
import dev.bifel.lampalarm.persistance.source.WebRemoteDataSource
import dev.bifel.lampalarm.persistance.web.Api
import dev.bifel.lampalarm.persistance.web.WebServiceGenerator
import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext

/**
 * Date: 05.10.2019
 * Time: 3:14
 *
 * @author Bohdan Ishchenko
 */
val repositoryModule: Module = applicationContext {
    factory { Repository(get(), get()) }
    factory { WebRemoteDataSource(get()) }
    factory { RoomDataSource() }

}

val retrofitModule = applicationContext {
    factory { WebServiceGenerator().createService(Api::class.java) }
}