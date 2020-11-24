package qq.daniyar.mjuldiznama.data.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import qq.daniyar.mjuldiznama.utils.Constants.BASE_URL
import qq.daniyar.mjuldiznama.utils.Constants.TIMEOUT_REQUEST
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitService {

    private val logging = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BASIC)

    private val client: OkHttpClient = OkHttpClient.Builder()
        .addInterceptor { chain ->
            val original = chain.request()
            val request = original.newBuilder()
                .header("Content-Type","application/json")
                .build()
            chain.proceed(request)
        }
        .addInterceptor(logging)
        .connectTimeout(TIMEOUT_REQUEST, TimeUnit.SECONDS)
        .readTimeout(TIMEOUT_REQUEST, TimeUnit.SECONDS)
        .writeTimeout(TIMEOUT_REQUEST, TimeUnit.SECONDS)
        .build()
    private const val host = BASE_URL

    private var retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(host)
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

    fun <S> createService(serviceClass: Class<S>): S {
        return retrofit.create(serviceClass)
    }
}