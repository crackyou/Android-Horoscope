package qq.daniyar.mjuldiznama.data.api


import qq.daniyar.mjuldiznama.data.model.MainResponse
import retrofit2.Response

interface ApiHelper {

    suspend fun getAll(): Response<MainResponse>

}