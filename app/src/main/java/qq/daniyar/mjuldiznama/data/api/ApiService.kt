package qq.daniyar.mjuldiznama.data.api

import okhttp3.RequestBody
import qq.daniyar.mjuldiznama.data.model.MainResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {

    @POST("/api/v1/get-all")
    suspend fun getAll(): Response<MainResponse>

}