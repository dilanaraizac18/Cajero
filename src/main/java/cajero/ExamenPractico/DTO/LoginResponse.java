
package cajero.ExamenPractico.DTO;


public class LoginResponse {
    private String Token;
    
    public LoginResponse(){}

    public LoginResponse(String Token) {
        this.Token = Token;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String Token) {
        this.Token = Token;
    }
    
    
    
}
