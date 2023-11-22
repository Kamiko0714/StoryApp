import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.storyapp.R

class RegisterActivity : AppCompatActivity() {

    private lateinit var edRegisterName: EditText
    private lateinit var edRegisterEmail: EditText
    private lateinit var edRegisterPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        edRegisterName = findViewById(R.id.ed_register_name)
        edRegisterEmail = findViewById(R.id.ed_register_email)
        edRegisterPassword = findViewById(R.id.ed_register_password)

        val registerButton: Button = findViewById(R.id.btn_register)
        registerButton.setOnClickListener {
            registerUser()
        }
    }

    private fun registerUser() {
        val name = edRegisterName.text.toString()
        val email = edRegisterEmail.text.toString()
        val password = edRegisterPassword.text.toString()

        // Validasi input sebelum registrasi
        if (name.isEmpty() || !isValidEmail(email) || password.length < 8) {
            Toast.makeText(this, "Invalid input. Please check your data.", Toast.LENGTH_SHORT).show()
            return
        }

        // Lakukan proses registrasi, lalu simpan data sesi dan token jika berhasil
        if (performRegistration(name, email, password)) {
            saveSessionData(email, "dummyToken") // Gantilah dengan data sesuai kebutuhan
            navigateToMainActivity()
        } else {
            // Tampilkan pesan error secara umum
            Toast.makeText(this, "Registration failed. Please try again.", Toast.LENGTH_SHORT).show()
        }
    }

    private fun performRegistration(name: String, email: String, password: String): Boolean {
        // Implementasikan logika registrasi di sini
        // Return true jika registrasi berhasil, false jika gagal
        return true
    }

    private fun saveSessionData(email: String, token: String) {
        // Implementasikan penyimpanan data sesi di sini
    }

    private fun navigateToMainActivity() {
        // Implementasikan navigasi ke MainActivity di sini
    }

    private fun isValidEmail(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}
