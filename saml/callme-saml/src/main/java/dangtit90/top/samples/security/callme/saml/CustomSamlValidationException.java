package dangtit90.top.samples.security.callme.saml;

import org.springframework.security.saml2.Saml2Exception;

public class CustomSamlValidationException extends Saml2Exception {
    public CustomSamlValidationException(String message) {
        super(message);
    }
}
