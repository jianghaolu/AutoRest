// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.


package fixtures.http;

import com.google.gson.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import fixtures.http.models.Error;

public class HttpFailureImpl implements HttpFailure {
    private HttpFailureService service;

    public HttpFailureImpl(RestAdapter restAdapter) {
        service = restAdapter.create(HttpFailureService.class);
    }

    /**
     * Get empty error form server
     *
     * @return the boolean object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public boolean getEmptyError() throws ServiceException {
        try {
            ServiceResponse<Boolean> response = getEmptyErrorDelegate(service.getEmptyError(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Boolean> response = getEmptyErrorDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get empty error form server
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getEmptyErrorAsync(final ServiceCallback<Boolean> serviceCallback) {
        service.getEmptyErrorAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getEmptyErrorDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Boolean> getEmptyErrorDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Boolean>()
                .register(200, new TypeToken<Boolean>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

}