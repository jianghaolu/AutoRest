/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodybyte.implementation;

import retrofit2.Retrofit;
import fixtures.bodybyte.Bytes;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.bodybyte.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Bytes.
 */
public final class BytesImpl implements Bytes {
    /** The Retrofit service to perform REST calls. */
    private BytesService service;
    /** The service client containing this operation class. */
    private AutoRestSwaggerBATByteServiceImpl client;

    /**
     * Initializes an instance of Bytes.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BytesImpl(Retrofit retrofit, AutoRestSwaggerBATByteServiceImpl client) {
        this.service = retrofit.create(BytesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Bytes to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BytesService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("byte/null")
        Observable<Response<ResponseBody>> getNull();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("byte/empty")
        Observable<Response<ResponseBody>> getEmpty();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("byte/nonAscii")
        Observable<Response<ResponseBody>> getNonAscii();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("byte/nonAscii")
        Observable<Response<ResponseBody>> putNonAscii(@Body byte[] byteBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("byte/invalid")
        Observable<Response<ResponseBody>> getInvalid();

    }

    /**
     * Get null byte value.
     *
     * @return the byte[] object if successful.
     */
    public byte[] getNull() {
        return getNullWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Get null byte value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<byte[]> getNullAsync(final ServiceCallback<byte[]> serviceCallback) {
        return ServiceCall.fromResponse(getNullWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get null byte value.
     *
     * @return the observable to the byte[] object
     */
    public Observable<byte[]> getNullAsync() {
        return getNullWithServiceResponseAsync().map(new Func1<ServiceResponse<byte[]>, byte[]>() {
            @Override
            public byte[] call(ServiceResponse<byte[]> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Get null byte value.
     *
     * @return the observable to the byte[] object
     */
    public Observable<ServiceResponse<byte[]>> getNullWithServiceResponseAsync() {
        return service.getNull()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<byte[]>>>() {
                @Override
                public Observable<ServiceResponse<byte[]>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<byte[]> clientResponse = getNullDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<byte[]> getNullDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<byte[], ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<byte[]>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get empty byte value ''.
     *
     * @return the byte[] object if successful.
     */
    public byte[] getEmpty() {
        return getEmptyWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Get empty byte value ''.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<byte[]> getEmptyAsync(final ServiceCallback<byte[]> serviceCallback) {
        return ServiceCall.fromResponse(getEmptyWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get empty byte value ''.
     *
     * @return the observable to the byte[] object
     */
    public Observable<byte[]> getEmptyAsync() {
        return getEmptyWithServiceResponseAsync().map(new Func1<ServiceResponse<byte[]>, byte[]>() {
            @Override
            public byte[] call(ServiceResponse<byte[]> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Get empty byte value ''.
     *
     * @return the observable to the byte[] object
     */
    public Observable<ServiceResponse<byte[]>> getEmptyWithServiceResponseAsync() {
        return service.getEmpty()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<byte[]>>>() {
                @Override
                public Observable<ServiceResponse<byte[]>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<byte[]> clientResponse = getEmptyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<byte[]> getEmptyDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<byte[], ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<byte[]>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @return the byte[] object if successful.
     */
    public byte[] getNonAscii() {
        return getNonAsciiWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Get non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<byte[]> getNonAsciiAsync(final ServiceCallback<byte[]> serviceCallback) {
        return ServiceCall.fromResponse(getNonAsciiWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @return the observable to the byte[] object
     */
    public Observable<byte[]> getNonAsciiAsync() {
        return getNonAsciiWithServiceResponseAsync().map(new Func1<ServiceResponse<byte[]>, byte[]>() {
            @Override
            public byte[] call(ServiceResponse<byte[]> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Get non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @return the observable to the byte[] object
     */
    public Observable<ServiceResponse<byte[]>> getNonAsciiWithServiceResponseAsync() {
        return service.getNonAscii()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<byte[]>>>() {
                @Override
                public Observable<ServiceResponse<byte[]>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<byte[]> clientResponse = getNonAsciiDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<byte[]> getNonAsciiDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<byte[], ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<byte[]>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @param byteBody Base64-encoded non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6)
     */
    public void putNonAscii(byte[] byteBody) {
        putNonAsciiWithServiceResponseAsync(byteBody).toBlocking().single().getBody();
    }

    /**
     * Put non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @param byteBody Base64-encoded non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> putNonAsciiAsync(byte[] byteBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.fromResponse(putNonAsciiWithServiceResponseAsync(byteBody), serviceCallback);
    }

    /**
     * Put non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @param byteBody Base64-encoded non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6)
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putNonAsciiAsync(byte[] byteBody) {
        return putNonAsciiWithServiceResponseAsync(byteBody).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Put non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @param byteBody Base64-encoded non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6)
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putNonAsciiWithServiceResponseAsync(byte[] byteBody) {
        if (byteBody == null) {
            throw new IllegalArgumentException("Parameter byteBody is required and cannot be null.");
        }
        return service.putNonAscii(byteBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putNonAsciiDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putNonAsciiDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get invalid byte value ':::SWAGGER::::'.
     *
     * @return the byte[] object if successful.
     */
    public byte[] getInvalid() {
        return getInvalidWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Get invalid byte value ':::SWAGGER::::'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<byte[]> getInvalidAsync(final ServiceCallback<byte[]> serviceCallback) {
        return ServiceCall.fromResponse(getInvalidWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get invalid byte value ':::SWAGGER::::'.
     *
     * @return the observable to the byte[] object
     */
    public Observable<byte[]> getInvalidAsync() {
        return getInvalidWithServiceResponseAsync().map(new Func1<ServiceResponse<byte[]>, byte[]>() {
            @Override
            public byte[] call(ServiceResponse<byte[]> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Get invalid byte value ':::SWAGGER::::'.
     *
     * @return the observable to the byte[] object
     */
    public Observable<ServiceResponse<byte[]>> getInvalidWithServiceResponseAsync() {
        return service.getInvalid()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<byte[]>>>() {
                @Override
                public Observable<ServiceResponse<byte[]>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<byte[]> clientResponse = getInvalidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<byte[]> getInvalidDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<byte[], ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<byte[]>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
