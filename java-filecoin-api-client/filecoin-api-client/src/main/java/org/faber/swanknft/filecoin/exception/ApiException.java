package org.faber.swanknft.filecoin.exception;

/**
 * API exception
 * @author rda
 */
public class ApiException extends RuntimeException {

    private ApiError error;

    public ApiException(ApiError apiError) {
        this.error = apiError;
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiError getError() {
        return error;
    }

    public void setError(ApiError error) {
        this.error = error;
    }

    @Override
    public String getMessage() {
        if (error != null) {
            return error.getMessage();
        }
        return super.getMessage();
    }
}
