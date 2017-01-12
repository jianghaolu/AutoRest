/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.requiredoptional.implementation;

import retrofit2.Retrofit;
import fixtures.requiredoptional.Implicits;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.requiredoptional.models.Error;
import fixtures.requiredoptional.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Implicits.
 */
public final class ImplicitsImpl implements Implicits {
    /** The Retrofit service to perform REST calls. */
    private ImplicitsService service;
    /** The service client containing this operation class. */
    private AutoRestRequiredOptionalTestServiceImpl client;

    /**
     * Initializes an instance of Implicits.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ImplicitsImpl(Retrofit retrofit, AutoRestRequiredOptionalTestServiceImpl client) {
        this.service = retrofit.create(ImplicitsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Implicits to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ImplicitsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.requiredoptional.Implicits getRequiredPath" })
        @GET("reqopt/implicit/required/path/{pathParameter}")
        Observable<Response<ResponseBody>> getRequiredPath(@Path("pathParameter") String pathParameter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.requiredoptional.Implicits putOptionalQuery" })
        @PUT("reqopt/implicit/optional/query")
        Observable<Response<ResponseBody>> putOptionalQuery(@Query("queryParameter") String queryParameter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.requiredoptional.Implicits putOptionalHeader" })
        @PUT("reqopt/implicit/optional/header")
        Observable<Response<ResponseBody>> putOptionalHeader(@Header("queryParameter") String queryParameter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.requiredoptional.Implicits putOptionalBody" })
        @PUT("reqopt/implicit/optional/body")
        Observable<Response<ResponseBody>> putOptionalBody(@Body String bodyParameter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.requiredoptional.Implicits getRequiredGlobalPath" })
        @GET("reqopt/global/required/path/{required-global-path}")
        Observable<Response<ResponseBody>> getRequiredGlobalPath(@Path("required-global-path") String requiredGlobalPath);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.requiredoptional.Implicits getRequiredGlobalQuery" })
        @GET("reqopt/global/required/query")
        Observable<Response<ResponseBody>> getRequiredGlobalQuery(@Query("required-global-query") String requiredGlobalQuery);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.requiredoptional.Implicits getOptionalGlobalQuery" })
        @GET("reqopt/global/optional/query")
        Observable<Response<ResponseBody>> getOptionalGlobalQuery(@Query("optional-global-query") Integer optionalGlobalQuery);

    }

    /**
     * Test implicitly required path parameter.
     *
     * @param pathParameter the String value
     * @return the Error object if successful.
     */
    public Error getRequiredPath(String pathParameter) {
        return getRequiredPathWithServiceResponseAsync(pathParameter).toBlocking().single().body();
    }

    /**
     * Test implicitly required path parameter.
     *
     * @param pathParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Error> getRequiredPathAsync(String pathParameter, final ServiceCallback<Error> serviceCallback) {
        return ServiceCall.fromResponse(getRequiredPathWithServiceResponseAsync(pathParameter), serviceCallback);
    }

    /**
     * Test implicitly required path parameter.
     *
     * @param pathParameter the String value
     * @return the observable to the Error object
     */
    public Observable<Error> getRequiredPathAsync(String pathParameter) {
        return getRequiredPathWithServiceResponseAsync(pathParameter).map(new Func1<ServiceResponse<Error>, Error>() {
            @Override
            public Error call(ServiceResponse<Error> response) {
                return response.body();
            }
        });
    }

    /**
     * Test implicitly required path parameter.
     *
     * @param pathParameter the String value
     * @return the observable to the Error object
     */
    public Observable<ServiceResponse<Error>> getRequiredPathWithServiceResponseAsync(String pathParameter) {
        if (pathParameter == null) {
            throw new IllegalArgumentException("Parameter pathParameter is required and cannot be null.");
        }
        return service.getRequiredPath(pathParameter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Error>>>() {
                @Override
                public Observable<ServiceResponse<Error>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Error> clientResponse = getRequiredPathDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Error> getRequiredPathDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Error, ErrorException>newInstance(this.client.serializerAdapter())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Test implicitly optional query parameter.
     *
     */
    public void putOptionalQuery() {
        putOptionalQueryWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Test implicitly optional query parameter.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> putOptionalQueryAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.fromResponse(putOptionalQueryWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Test implicitly optional query parameter.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putOptionalQueryAsync() {
        return putOptionalQueryWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Test implicitly optional query parameter.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putOptionalQueryWithServiceResponseAsync() {
        final String queryParameter = null;
        return service.putOptionalQuery(queryParameter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putOptionalQueryDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Test implicitly optional query parameter.
     *
     * @param queryParameter the String value
     */
    public void putOptionalQuery(String queryParameter) {
        putOptionalQueryWithServiceResponseAsync(queryParameter).toBlocking().single().body();
    }

    /**
     * Test implicitly optional query parameter.
     *
     * @param queryParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> putOptionalQueryAsync(String queryParameter, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.fromResponse(putOptionalQueryWithServiceResponseAsync(queryParameter), serviceCallback);
    }

    /**
     * Test implicitly optional query parameter.
     *
     * @param queryParameter the String value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putOptionalQueryAsync(String queryParameter) {
        return putOptionalQueryWithServiceResponseAsync(queryParameter).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Test implicitly optional query parameter.
     *
     * @param queryParameter the String value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putOptionalQueryWithServiceResponseAsync(String queryParameter) {
        return service.putOptionalQuery(queryParameter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putOptionalQueryDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putOptionalQueryDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Test implicitly optional header parameter.
     *
     */
    public void putOptionalHeader() {
        putOptionalHeaderWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Test implicitly optional header parameter.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> putOptionalHeaderAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.fromResponse(putOptionalHeaderWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Test implicitly optional header parameter.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putOptionalHeaderAsync() {
        return putOptionalHeaderWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Test implicitly optional header parameter.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putOptionalHeaderWithServiceResponseAsync() {
        final String queryParameter = null;
        return service.putOptionalHeader(queryParameter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putOptionalHeaderDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Test implicitly optional header parameter.
     *
     * @param queryParameter the String value
     */
    public void putOptionalHeader(String queryParameter) {
        putOptionalHeaderWithServiceResponseAsync(queryParameter).toBlocking().single().body();
    }

    /**
     * Test implicitly optional header parameter.
     *
     * @param queryParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> putOptionalHeaderAsync(String queryParameter, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.fromResponse(putOptionalHeaderWithServiceResponseAsync(queryParameter), serviceCallback);
    }

    /**
     * Test implicitly optional header parameter.
     *
     * @param queryParameter the String value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putOptionalHeaderAsync(String queryParameter) {
        return putOptionalHeaderWithServiceResponseAsync(queryParameter).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Test implicitly optional header parameter.
     *
     * @param queryParameter the String value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putOptionalHeaderWithServiceResponseAsync(String queryParameter) {
        return service.putOptionalHeader(queryParameter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putOptionalHeaderDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putOptionalHeaderDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Test implicitly optional body parameter.
     *
     */
    public void putOptionalBody() {
        putOptionalBodyWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Test implicitly optional body parameter.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> putOptionalBodyAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.fromResponse(putOptionalBodyWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Test implicitly optional body parameter.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putOptionalBodyAsync() {
        return putOptionalBodyWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Test implicitly optional body parameter.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putOptionalBodyWithServiceResponseAsync() {
        final String bodyParameter = null;
        return service.putOptionalBody(bodyParameter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putOptionalBodyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Test implicitly optional body parameter.
     *
     * @param bodyParameter the String value
     */
    public void putOptionalBody(String bodyParameter) {
        putOptionalBodyWithServiceResponseAsync(bodyParameter).toBlocking().single().body();
    }

    /**
     * Test implicitly optional body parameter.
     *
     * @param bodyParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> putOptionalBodyAsync(String bodyParameter, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.fromResponse(putOptionalBodyWithServiceResponseAsync(bodyParameter), serviceCallback);
    }

    /**
     * Test implicitly optional body parameter.
     *
     * @param bodyParameter the String value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putOptionalBodyAsync(String bodyParameter) {
        return putOptionalBodyWithServiceResponseAsync(bodyParameter).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Test implicitly optional body parameter.
     *
     * @param bodyParameter the String value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putOptionalBodyWithServiceResponseAsync(String bodyParameter) {
        return service.putOptionalBody(bodyParameter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putOptionalBodyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putOptionalBodyDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Test implicitly required path parameter.
     *
     * @return the Error object if successful.
     */
    public Error getRequiredGlobalPath() {
        return getRequiredGlobalPathWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Test implicitly required path parameter.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Error> getRequiredGlobalPathAsync(final ServiceCallback<Error> serviceCallback) {
        return ServiceCall.fromResponse(getRequiredGlobalPathWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Test implicitly required path parameter.
     *
     * @return the observable to the Error object
     */
    public Observable<Error> getRequiredGlobalPathAsync() {
        return getRequiredGlobalPathWithServiceResponseAsync().map(new Func1<ServiceResponse<Error>, Error>() {
            @Override
            public Error call(ServiceResponse<Error> response) {
                return response.body();
            }
        });
    }

    /**
     * Test implicitly required path parameter.
     *
     * @return the observable to the Error object
     */
    public Observable<ServiceResponse<Error>> getRequiredGlobalPathWithServiceResponseAsync() {
        if (this.client.requiredGlobalPath() == null) {
            throw new IllegalArgumentException("Parameter this.client.requiredGlobalPath() is required and cannot be null.");
        }
        return service.getRequiredGlobalPath(this.client.requiredGlobalPath())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Error>>>() {
                @Override
                public Observable<ServiceResponse<Error>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Error> clientResponse = getRequiredGlobalPathDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Error> getRequiredGlobalPathDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Error, ErrorException>newInstance(this.client.serializerAdapter())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Test implicitly required query parameter.
     *
     * @return the Error object if successful.
     */
    public Error getRequiredGlobalQuery() {
        return getRequiredGlobalQueryWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Test implicitly required query parameter.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Error> getRequiredGlobalQueryAsync(final ServiceCallback<Error> serviceCallback) {
        return ServiceCall.fromResponse(getRequiredGlobalQueryWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Test implicitly required query parameter.
     *
     * @return the observable to the Error object
     */
    public Observable<Error> getRequiredGlobalQueryAsync() {
        return getRequiredGlobalQueryWithServiceResponseAsync().map(new Func1<ServiceResponse<Error>, Error>() {
            @Override
            public Error call(ServiceResponse<Error> response) {
                return response.body();
            }
        });
    }

    /**
     * Test implicitly required query parameter.
     *
     * @return the observable to the Error object
     */
    public Observable<ServiceResponse<Error>> getRequiredGlobalQueryWithServiceResponseAsync() {
        if (this.client.requiredGlobalQuery() == null) {
            throw new IllegalArgumentException("Parameter this.client.requiredGlobalQuery() is required and cannot be null.");
        }
        return service.getRequiredGlobalQuery(this.client.requiredGlobalQuery())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Error>>>() {
                @Override
                public Observable<ServiceResponse<Error>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Error> clientResponse = getRequiredGlobalQueryDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Error> getRequiredGlobalQueryDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Error, ErrorException>newInstance(this.client.serializerAdapter())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Test implicitly optional query parameter.
     *
     * @return the Error object if successful.
     */
    public Error getOptionalGlobalQuery() {
        return getOptionalGlobalQueryWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Test implicitly optional query parameter.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Error> getOptionalGlobalQueryAsync(final ServiceCallback<Error> serviceCallback) {
        return ServiceCall.fromResponse(getOptionalGlobalQueryWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Test implicitly optional query parameter.
     *
     * @return the observable to the Error object
     */
    public Observable<Error> getOptionalGlobalQueryAsync() {
        return getOptionalGlobalQueryWithServiceResponseAsync().map(new Func1<ServiceResponse<Error>, Error>() {
            @Override
            public Error call(ServiceResponse<Error> response) {
                return response.body();
            }
        });
    }

    /**
     * Test implicitly optional query parameter.
     *
     * @return the observable to the Error object
     */
    public Observable<ServiceResponse<Error>> getOptionalGlobalQueryWithServiceResponseAsync() {
        return service.getOptionalGlobalQuery(this.client.optionalGlobalQuery())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Error>>>() {
                @Override
                public Observable<ServiceResponse<Error>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Error> clientResponse = getOptionalGlobalQueryDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Error> getOptionalGlobalQueryDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Error, ErrorException>newInstance(this.client.serializerAdapter())
                .registerError(ErrorException.class)
                .build(response);
    }

}
