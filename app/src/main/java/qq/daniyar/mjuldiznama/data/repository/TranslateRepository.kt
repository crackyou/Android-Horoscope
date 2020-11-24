package qq.daniyar.mjuldiznama.data.repository

import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.toRequestBody
import qq.daniyar.mjuldiznama.data.api.ApiHelper
import qq.daniyar.mjuldiznama.data.model.MainResponse
import retrofit2.Response
import javax.inject.Inject

class TranslateRepository @Inject constructor(
    private val apiHelper: ApiHelper
){

    suspend fun getTranslatedText(text: String, from: String, to: String): Response<MainResponse> {

        return apiHelper.getAll()
    }
}