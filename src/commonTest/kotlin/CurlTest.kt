import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.http.HttpStatusCode
import io.ktor.utils.io.core.use
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals

class CurlTest {
    @Test
    fun testGoogle() {
        runBlocking {
            HttpClient().use { httpClient ->
                val response = httpClient.get("https://google.com")
                assertEquals(response.status, HttpStatusCode.OK)
            }
        }
    }
}
