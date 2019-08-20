/*
 *    Copyright 2008-2018 unblu inc., Sarnen, Switzerland
 *    All rights reserved.
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
package fr.jmini.openapi.openapitools.restassured.misc;

import io.restassured.response.Response;

import org.apache.http.HttpStatus;

import java.util.function.Function;

import junit.framework.AssertionFailedError;

public class ApiUtil {

    /**
     * Handler that can be used for Operation that returns {@value HttpStatus#SC_OK}.
     *
     * @return a function that can be used in executeAs(executeAs(Function&lt;Response, Response&gt;) method
     */
    public static Function<Response, Response> expectOkHandler() {
        return r -> {
            ensureStatusCode(r, HttpStatus.SC_OK);
            return r.thenReturn();
        };
    }

    /**
     * Handler that can be used for Operation that returns {@value HttpStatus#SC_OK}, but where the response content can be empty.
     *
     * @return a function that can be used in execute(Function&lt;Response, Object&gt;) method
     */
    public static <T> Function<Response, T> expectOkHandler(Class<T> cls) {
        return r -> {
            ensureStatusCode(r, HttpStatus.SC_OK);
            String response = r.body()
                .asString();
            if (response == null || response.isEmpty()) {
                return null;
            }
            return r.as(cls);
        };
    }

    /**
     * Handler that can be used for Operation that returns {@value HttpStatus#SC_OK}, but where the returned Object is null.
     *
     * @return a function that can be used in execute(Function&lt;Response, Object&gt;) method
     */
    public static <T> Function<Response, T> expectOkNoReturnValueHandler() {
        return createHandlerForEmptyResponseWithCustomStatusCode(HttpStatus.SC_OK);
    }

    /**
     * Handler that can be used for Operation that returns {@value HttpStatus#SC_CREATED}.
     *
     * @return a function that can be used in execute(Function&lt;Response, Object&gt;) method
     */
    public static <T> Function<Response, T> expectCreatedHandler() {
        return createHandlerForEmptyResponseWithCustomStatusCode(HttpStatus.SC_CREATED);
    }

    /**
     * Handler that can be used for Operation that returns {@value HttpStatus#SC_NO_CONTENT}.
     *
     * @return a function that can be used in execute(Function&lt;Response, Object&gt;) method
     */
    public static <T> Function<Response, T> expectEmptyHandler() {
        return createHandlerForEmptyResponseWithCustomStatusCode(HttpStatus.SC_NO_CONTENT);
    }

    /**
     * Handler that can be used that returns nothing, with a custom statusCode.
     *
     * @param statusCode
     *            HTTP status code, see {@link HttpStatus} enum
     * @return a function that can be used in execute(Function&lt;Response, Object&gt;) method
     */
    private static <T> Function<Response, T> createHandlerForEmptyResponseWithCustomStatusCode(
        final int statusCode) {
        return r -> {
            ensureStatusCode(r, statusCode);
            final String result = r.getBody()
                .asString();
            if (result != null && !result.isEmpty()) {
                throw new AssertionFailedError("Expect an empty response, but got: " + result);
            }
            return null;
        };
    }

    private static void ensureStatusCode(Response r, final int expectedStatusCode)
        throws AssertionFailedError {
        if (r.getStatusCode() != expectedStatusCode) {
            throw new AssertionFailedError(
                "Got unexpected error code '"
                    + r.getStatusCode()
                    + "' from the server (expecting '"
                    + expectedStatusCode
                    + "'):\n"
                    + r.getBody()
                        .print()
            );
        }
    }
}
