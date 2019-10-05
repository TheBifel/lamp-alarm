package dev.bifel.lampalarm.persistance.source

import dev.bifel.lampalarm.persistance.web.Api
import org.koin.standalone.KoinComponent

/**
 * Date: 05.10.2019
 * Time: 3:43
 *
 * @author Bohdan Ishchenko
 */
class WebRemoteDataSource(api: Api) : RemoteDataSource, KoinComponent {
}