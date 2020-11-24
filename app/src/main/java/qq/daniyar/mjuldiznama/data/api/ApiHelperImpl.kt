package qq.daniyar.mjuldiznama.data.api

import qq.daniyar.mjuldiznama.data.model.MainResponse
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(private val apiService: ApiService) : ApiHelper {

    override suspend fun getAll(): Response<MainResponse> = apiService.getAll()

}