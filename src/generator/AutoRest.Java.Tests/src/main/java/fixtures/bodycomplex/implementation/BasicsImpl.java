/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.implementation;

import retrofit2.Retrofit;
import fixtures.bodycomplex.Basics;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import fixtures.bodycomplex.models.Basic;
import fixtures.bodycomplex.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Basics.
 */
public final class BasicsImpl implements Basics {
    /** The Retrofit service to perform REST calls. */
    private BasicsService service;
    /** The service client containing this operation class. */
    private AutoRestComplexTestServiceImpl client;

    /**
     * Initializes an instance of Basics.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BasicsImpl(Retrofit retrofit, AutoRestComplexTestServiceImpl client) {
        this.service = retrofit.create(BasicsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Basics to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BasicsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("complex/basic/valid")
        Observable<Response<ResponseBody>> getValid();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("complex/basic/valid")
        Observable<Response<ResponseBody>> putValid(@Body Basic complexBody, @Query("api-version") String apiVersion);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("complex/basic/invalid")
        Observable<Response<ResponseBody>> getInvalid();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("complex/basic/empty")
        Observable<Response<ResponseBody>> getEmpty();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("complex/basic/null")
        Observable<Response<ResponseBody>> getNull();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("complex/basic/notprovided")
        Observable<Response<ResponseBody>> getNotProvided();

    }

    /**
     * Get complex type {id: 2, name: 'abc', color: 'YELLOW'}.
     *
     * @return the Basic object if successful.
     */
    public Basic getValid() {
        return getValidWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Get complex type {id: 2, name: 'abc', color: 'YELLOW'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Basic> getValidAsync(final ServiceCallback<Basic> serviceCallback) {
        return ServiceCall.fromResponse(getValidWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get complex type {id: 2, name: 'abc', color: 'YELLOW'}.
     *
     * @return the observable to the Basic object
     */
    public Observable<Basic> getValidAsync() {
        return getValidWithServiceResponseAsync().map(new Func1<ServiceResponse<Basic>, Basic>() {
            @Override
            public Basic call(ServiceResponse<Basic> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Get complex type {id: 2, name: 'abc', color: 'YELLOW'}.
     *
     * @return the observable to the Basic object
     */
    public Observable<ServiceResponse<Basic>> getValidWithServiceResponseAsync() {
        return service.getValid()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Basic>>>() {
                @Override
                public Observable<ServiceResponse<Basic>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Basic> clientResponse = getValidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Basic> getValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Basic, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Basic>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Please put {id: 2, name: 'abc', color: 'Magenta'}.
     *
     * @param complexBody Please put {id: 2, name: 'abc', color: 'Magenta'}
     */
    public void putValid(Basic complexBody) {
        putValidWithServiceResponseAsync(complexBody).toBlocking().single().getBody();
    }

    /**
     * Please put {id: 2, name: 'abc', color: 'Magenta'}.
     *
     * @param complexBody Please put {id: 2, name: 'abc', color: 'Magenta'}
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> putValidAsync(Basic complexBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.fromResponse(putValidWithServiceResponseAsync(complexBody), serviceCallback);
    }

    /**
     * Please put {id: 2, name: 'abc', color: 'Magenta'}.
     *
     * @param complexBody Please put {id: 2, name: 'abc', color: 'Magenta'}
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putValidAsync(Basic complexBody) {
        return putValidWithServiceResponseAsync(complexBody).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Please put {id: 2, name: 'abc', color: 'Magenta'}.
     *
     * @param complexBody Please put {id: 2, name: 'abc', color: 'Magenta'}
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putValidWithServiceResponseAsync(Basic complexBody) {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        return service.putValid(complexBody, this.client.apiVersion())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putValidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get a basic complex type that is invalid for the local strong type.
     *
     * @return the Basic object if successful.
     */
    public Basic getInvalid() {
        return getInvalidWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Get a basic complex type that is invalid for the local strong type.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Basic> getInvalidAsync(final ServiceCallback<Basic> serviceCallback) {
        return ServiceCall.fromResponse(getInvalidWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get a basic complex type that is invalid for the local strong type.
     *
     * @return the observable to the Basic object
     */
    public Observable<Basic> getInvalidAsync() {
        return getInvalidWithServiceResponseAsync().map(new Func1<ServiceResponse<Basic>, Basic>() {
            @Override
            public Basic call(ServiceResponse<Basic> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Get a basic complex type that is invalid for the local strong type.
     *
     * @return the observable to the Basic object
     */
    public Observable<ServiceResponse<Basic>> getInvalidWithServiceResponseAsync() {
        return service.getInvalid()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Basic>>>() {
                @Override
                public Observable<ServiceResponse<Basic>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Basic> clientResponse = getInvalidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Basic> getInvalidDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Basic, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Basic>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get a basic complex type that is empty.
     *
     * @return the Basic object if successful.
     */
    public Basic getEmpty() {
        return getEmptyWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Get a basic complex type that is empty.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Basic> getEmptyAsync(final ServiceCallback<Basic> serviceCallback) {
        return ServiceCall.fromResponse(getEmptyWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get a basic complex type that is empty.
     *
     * @return the observable to the Basic object
     */
    public Observable<Basic> getEmptyAsync() {
        return getEmptyWithServiceResponseAsync().map(new Func1<ServiceResponse<Basic>, Basic>() {
            @Override
            public Basic call(ServiceResponse<Basic> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Get a basic complex type that is empty.
     *
     * @return the observable to the Basic object
     */
    public Observable<ServiceResponse<Basic>> getEmptyWithServiceResponseAsync() {
        return service.getEmpty()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Basic>>>() {
                @Override
                public Observable<ServiceResponse<Basic>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Basic> clientResponse = getEmptyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Basic> getEmptyDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Basic, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Basic>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get a basic complex type whose properties are null.
     *
     * @return the Basic object if successful.
     */
    public Basic getNull() {
        return getNullWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Get a basic complex type whose properties are null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Basic> getNullAsync(final ServiceCallback<Basic> serviceCallback) {
        return ServiceCall.fromResponse(getNullWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get a basic complex type whose properties are null.
     *
     * @return the observable to the Basic object
     */
    public Observable<Basic> getNullAsync() {
        return getNullWithServiceResponseAsync().map(new Func1<ServiceResponse<Basic>, Basic>() {
            @Override
            public Basic call(ServiceResponse<Basic> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Get a basic complex type whose properties are null.
     *
     * @return the observable to the Basic object
     */
    public Observable<ServiceResponse<Basic>> getNullWithServiceResponseAsync() {
        return service.getNull()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Basic>>>() {
                @Override
                public Observable<ServiceResponse<Basic>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Basic> clientResponse = getNullDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Basic> getNullDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Basic, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Basic>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get a basic complex type while the server doesn't provide a response payload.
     *
     * @return the Basic object if successful.
     */
    public Basic getNotProvided() {
        return getNotProvidedWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Get a basic complex type while the server doesn't provide a response payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Basic> getNotProvidedAsync(final ServiceCallback<Basic> serviceCallback) {
        return ServiceCall.fromResponse(getNotProvidedWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get a basic complex type while the server doesn't provide a response payload.
     *
     * @return the observable to the Basic object
     */
    public Observable<Basic> getNotProvidedAsync() {
        return getNotProvidedWithServiceResponseAsync().map(new Func1<ServiceResponse<Basic>, Basic>() {
            @Override
            public Basic call(ServiceResponse<Basic> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Get a basic complex type while the server doesn't provide a response payload.
     *
     * @return the observable to the Basic object
     */
    public Observable<ServiceResponse<Basic>> getNotProvidedWithServiceResponseAsync() {
        return service.getNotProvided()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Basic>>>() {
                @Override
                public Observable<ServiceResponse<Basic>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Basic> clientResponse = getNotProvidedDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Basic> getNotProvidedDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Basic, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Basic>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
