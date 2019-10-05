package dev.bifel.lampalarm.persistance.repository

import dev.bifel.lampalarm.persistance.source.LocalDataSource
import dev.bifel.lampalarm.persistance.source.RemoteDataSource
import org.koin.standalone.KoinComponent

/**
 * Date: 05.10.2019
 * Time: 3:38
 *
 * @author Bohdan Ishchenko
 */
class Repository(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource
) : DataRepository, KoinComponent {

}