/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.validation.implementation;

import fixtures.validation.AutoRestValidationTest;
import com.microsoft.rest.ServiceClient;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.Validator;
import fixtures.validation.models.ErrorException;
import fixtures.validation.models.Product;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * Initializes a new instance of the AutoRestValidationTest class.
 */
public final class AutoRestValidationTestImpl extends ServiceClient implements AutoRestValidationTest {
    /**
     * The Retrofit service to perform REST calls.
     */
    private AutoRestValidationTestService service;

    /** Subscription ID. */
    private String subscriptionId;

    /**
     * Gets Subscription ID.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets Subscription ID.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public AutoRestValidationTestImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** Required string following pattern \d{2}-\d{2}-\d{4}. */
    private String apiVersion;

    /**
     * Gets Required string following pattern \d{2}-\d{2}-\d{4}.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /**
     * Sets Required string following pattern \d{2}-\d{2}-\d{4}.
     *
     * @param apiVersion the apiVersion value.
     * @return the service client itself
     */
    public AutoRestValidationTestImpl withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Initializes an instance of AutoRestValidationTest client.
     */
    public AutoRestValidationTestImpl() {
        this("http://localhost");
    }

    /**
     * Initializes an instance of AutoRestValidationTest client.
     *
     * @param baseUrl the base URL of the host
     */
    public AutoRestValidationTestImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestValidationTest client.
     *
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public AutoRestValidationTestImpl(OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        this("http://localhost", clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestValidationTest client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public AutoRestValidationTestImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        super(baseUrl, clientBuilder, restBuilder);
        initialize();
    }

    private void initialize() {
        initializeService();
    }

    private void initializeService() {
        service = retrofit().create(AutoRestValidationTestService.class);
    }

    /**
     * The interface defining all the services for AutoRestValidationTest to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AutoRestValidationTestService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("fakepath/{subscriptionId}/{resourceGroupName}/{id}")
        Observable<Response<ResponseBody>> validationOfMethodParameters(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("id") int id, @Query("apiVersion") String apiVersion);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("fakepath/{subscriptionId}/{resourceGroupName}/{id}")
        Observable<Response<ResponseBody>> validationOfBody(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("id") int id, @Body Product body, @Query("apiVersion") String apiVersion);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("validation/constantsInPath/{constantParam}/value")
        Observable<Response<ResponseBody>> getWithConstantInPath(@Path("constantParam") String constantParam);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("validation/constantsInPath/{constantParam}/value")
        Observable<Response<ResponseBody>> postWithConstantInBody(@Path("constantParam") String constantParam, @Body Product body);

    }

    /**
     * Validates input parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @return the Product object if successful.
     */
    public Product validationOfMethodParameters(String resourceGroupName, int id) {
        return validationOfMethodParametersWithServiceResponseAsync(resourceGroupName, id).toBlocking().single().getBody();
    }

    /**
     * Validates input parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Product> validationOfMethodParametersAsync(String resourceGroupName, int id, final ServiceCallback<Product> serviceCallback) {
        return ServiceCall.create(validationOfMethodParametersWithServiceResponseAsync(resourceGroupName, id), serviceCallback);
    }

    /**
     * Validates input parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @return the observable to the Product object
     */
    public Observable<Product> validationOfMethodParametersAsync(String resourceGroupName, int id) {
        return validationOfMethodParametersWithServiceResponseAsync(resourceGroupName, id).map(new Func1<ServiceResponse<Product>, Product>() {
            @Override
            public Product call(ServiceResponse<Product> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Validates input parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @return the observable to the Product object
     */
    public Observable<ServiceResponse<Product>> validationOfMethodParametersWithServiceResponseAsync(String resourceGroupName, int id) {
        if (this.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.apiVersion() is required and cannot be null.");
        }
        return service.validationOfMethodParameters(this.subscriptionId(), resourceGroupName, id, this.apiVersion())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Product>>>() {
                @Override
                public Observable<ServiceResponse<Product>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Product> clientResponse = validationOfMethodParametersDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Product> validationOfMethodParametersDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Product, ErrorException>(this.serializerAdapter())
                .register(200, new TypeToken<Product>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @return the Product object if successful.
     */
    public Product validationOfBody(String resourceGroupName, int id) {
        return validationOfBodyWithServiceResponseAsync(resourceGroupName, id).toBlocking().single().getBody();
    }

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Product> validationOfBodyAsync(String resourceGroupName, int id, final ServiceCallback<Product> serviceCallback) {
        return ServiceCall.create(validationOfBodyWithServiceResponseAsync(resourceGroupName, id), serviceCallback);
    }

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @return the observable to the Product object
     */
    public Observable<Product> validationOfBodyAsync(String resourceGroupName, int id) {
        return validationOfBodyWithServiceResponseAsync(resourceGroupName, id).map(new Func1<ServiceResponse<Product>, Product>() {
            @Override
            public Product call(ServiceResponse<Product> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @return the observable to the Product object
     */
    public Observable<ServiceResponse<Product>> validationOfBodyWithServiceResponseAsync(String resourceGroupName, int id) {
        if (this.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.apiVersion() is required and cannot be null.");
        }
        final Product body = null;
        return service.validationOfBody(this.subscriptionId(), resourceGroupName, id, body, this.apiVersion())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Product>>>() {
                @Override
                public Observable<ServiceResponse<Product>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Product> clientResponse = validationOfBodyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param body the Product value
     * @return the Product object if successful.
     */
    public Product validationOfBody(String resourceGroupName, int id, Product body) {
        return validationOfBodyWithServiceResponseAsync(resourceGroupName, id, body).toBlocking().single().getBody();
    }

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param body the Product value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Product> validationOfBodyAsync(String resourceGroupName, int id, Product body, final ServiceCallback<Product> serviceCallback) {
        return ServiceCall.create(validationOfBodyWithServiceResponseAsync(resourceGroupName, id, body), serviceCallback);
    }

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param body the Product value
     * @return the observable to the Product object
     */
    public Observable<Product> validationOfBodyAsync(String resourceGroupName, int id, Product body) {
        return validationOfBodyWithServiceResponseAsync(resourceGroupName, id, body).map(new Func1<ServiceResponse<Product>, Product>() {
            @Override
            public Product call(ServiceResponse<Product> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param body the Product value
     * @return the observable to the Product object
     */
    public Observable<ServiceResponse<Product>> validationOfBodyWithServiceResponseAsync(String resourceGroupName, int id, Product body) {
        if (this.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.apiVersion() is required and cannot be null.");
        }
        Validator.validate(body);
        return service.validationOfBody(this.subscriptionId(), resourceGroupName, id, body, this.apiVersion())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Product>>>() {
                @Override
                public Observable<ServiceResponse<Product>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Product> clientResponse = validationOfBodyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Product> validationOfBodyDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Product, ErrorException>(this.serializerAdapter())
                .register(200, new TypeToken<Product>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     *
     */
    public void getWithConstantInPath() {
        getWithConstantInPathWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> getWithConstantInPathAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(getWithConstantInPathWithServiceResponseAsync(), serviceCallback);
    }

    /**
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> getWithConstantInPathAsync() {
        return getWithConstantInPathWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.getBody();
            }
        });
    }

    /**
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getWithConstantInPathWithServiceResponseAsync() {
        final String constantParam = "constant";
        return service.getWithConstantInPath(constantParam)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = getWithConstantInPathDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> getWithConstantInPathDelegate(Response<ResponseBody> response) throws ServiceException, IOException {
        return new ServiceResponseBuilder<Void, ServiceException>(this.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     *
     * @return the Product object if successful.
     */
    public Product postWithConstantInBody() {
        return postWithConstantInBodyWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Product> postWithConstantInBodyAsync(final ServiceCallback<Product> serviceCallback) {
        return ServiceCall.create(postWithConstantInBodyWithServiceResponseAsync(), serviceCallback);
    }

    /**
     *
     * @return the observable to the Product object
     */
    public Observable<Product> postWithConstantInBodyAsync() {
        return postWithConstantInBodyWithServiceResponseAsync().map(new Func1<ServiceResponse<Product>, Product>() {
            @Override
            public Product call(ServiceResponse<Product> response) {
                return response.getBody();
            }
        });
    }

    /**
     *
     * @return the observable to the Product object
     */
    public Observable<ServiceResponse<Product>> postWithConstantInBodyWithServiceResponseAsync() {
        final String constantParam = "constant";
        final Product body = null;
        return service.postWithConstantInBody(constantParam, body)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Product>>>() {
                @Override
                public Observable<ServiceResponse<Product>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Product> clientResponse = postWithConstantInBodyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     *
     * @param body the Product value
     * @return the Product object if successful.
     */
    public Product postWithConstantInBody(Product body) {
        return postWithConstantInBodyWithServiceResponseAsync(body).toBlocking().single().getBody();
    }

    /**
     *
     * @param body the Product value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Product> postWithConstantInBodyAsync(Product body, final ServiceCallback<Product> serviceCallback) {
        return ServiceCall.create(postWithConstantInBodyWithServiceResponseAsync(body), serviceCallback);
    }

    /**
     *
     * @param body the Product value
     * @return the observable to the Product object
     */
    public Observable<Product> postWithConstantInBodyAsync(Product body) {
        return postWithConstantInBodyWithServiceResponseAsync(body).map(new Func1<ServiceResponse<Product>, Product>() {
            @Override
            public Product call(ServiceResponse<Product> response) {
                return response.getBody();
            }
        });
    }

    /**
     *
     * @param body the Product value
     * @return the observable to the Product object
     */
    public Observable<ServiceResponse<Product>> postWithConstantInBodyWithServiceResponseAsync(Product body) {
        Validator.validate(body);
        final String constantParam = "constant";
        return service.postWithConstantInBody(constantParam, body)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Product>>>() {
                @Override
                public Observable<ServiceResponse<Product>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Product> clientResponse = postWithConstantInBodyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Product> postWithConstantInBodyDelegate(Response<ResponseBody> response) throws ServiceException, IOException {
        return new ServiceResponseBuilder<Product, ServiceException>(this.serializerAdapter())
                .register(200, new TypeToken<Product>() { }.getType())
                .build(response);
    }

}
