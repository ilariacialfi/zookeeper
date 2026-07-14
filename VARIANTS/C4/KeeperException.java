/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.zookeeper;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.yetus.audience.InterfaceAudience;

@InterfaceAudience.Public
@SuppressWarnings("java:S1133")
public abstract class KeeperException extends Exception {

    /**
     * All multi-requests that result in an exception retain the results
     * here so that it is possible to examine the problems in the catch
     * scope.  Non-multi requests will get a null if they try to access
     * these results.
     */
    private final AtomicReference<List<OpResult>> results = new AtomicReference<>();

    /**
     * All non-specific keeper exceptions should be constructed via
     * this factory method in order to guarantee consistency in error
     * codes and such.  If you know the error code, then you should
     * construct the special purpose exception directly.  That will
     * allow you to have the most specific possible declarations of
     * what exceptions might actually be thrown.
     *
     * @param code The error code.
     * @param path The ZooKeeper path being operated on.
     * @return The specialized exception, presumably to be thrown by
     *  the caller.
     */
    public static KeeperException create(Code code, String path) {
        KeeperException r = create(code);
        r.path.set(path);
        return r;
    }

    /**
     * @deprecated deprecated in 3.1.0, use {@link #create(Code, String)}
     * instead
     */
    @Deprecated
    public static KeeperException create(int code, String path) {
        KeeperException r = create(Code.get(code));
        r.path.set(path);
        return r;
    }

    /**
     * @deprecated deprecated in 3.1.0, use {@link #create(Code)}
     * instead
     */
    @Deprecated
    public static KeeperException create(int code) {
        return create(Code.get(code));
    }

    /**
     * All non-specific keeper exceptions should be constructed via
     * this factory method in order to guarantee consistency in error
     * codes and such.  If you know the error code, then you should
     * construct the special purpose exception directly.  That will
     * allow you to have the most specific possible declarations of
     * what exceptions might actually be thrown.
     *
     * @param code The error code of your new exception.  This will
     * also determine the specific type of the exception that is
     * returned.
     * @return The specialized exception, presumably to be thrown by
     * the caller.
     */
    public static KeeperException create(Code code) {
        switch (code) {
        case SYSTEMERROR:
            return new SystemErrorException();
        case RUNTIMEINCONSISTENCY:
            return new RuntimeInconsistencyException();
        case DATAINCONSISTENCY:
            return new DataInconsistencyException();
        case CONNECTIONLOSS:
            return new ConnectionLossException();
        case MARSHALLINGERROR:
            return new MarshallingErrorException();
        case UNIMPLEMENTED:
            return new UnimplementedException();
        case OPERATIONTIMEOUT:
            return new OperationTimeoutException();
        case NEWCONFIGNOQUORUM:
            return new NewConfigNoQuorum();
        case RECONFIGINPROGRESS:
            return new ReconfigInProgress();
        case BADARGUMENTS:
            return new BadArgumentsException();
        case APIERROR:
            return new APIErrorException();
        case NONODE:
            return new NoNodeException();
        case NOAUTH:
            return new NoAuthException();
        case BADVERSION:
            return new BadVersionException();
        case NOCHILDRENFOREPHEMERALS:
            return new NoChildrenForEphemeralsException();
        case NODEEXISTS:
            return new NodeExistsException();
        case INVALIDACL:
            return new InvalidACLException();
        case AUTHFAILED:
            return new AuthFailedException();
        case NOTEMPTY:
            return new NotEmptyException();
        case SESSIONEXPIRED:
            return new SessionExpiredException();
        case INVALIDCALLBACK:
            return new InvalidCallbackException();
        case SESSIONMOVED:
            return new SessionMovedException();
        case NOTREADONLY:
            return new NotReadOnlyException();
        case EPHEMERALONLOCALSESSION:
            return new EphemeralOnLocalSessionException();
        case NOWATCHER:
            return new NoWatcherException();
        case RECONFIGDISABLED:
            return new ReconfigDisabledException();
        case SESSIONCLOSEDREQUIRESASLAUTH:
            return new SessionClosedRequireAuthException();
        case REQUESTTIMEOUT:
            return new RequestTimeoutException();
        case QUOTAEXCEEDED:
            return new QuotaExceededException();
        case THROTTLEDOP:
            return new ThrottledOpException();
        case OK:
        default:
            throw new IllegalArgumentException("Invalid exception code:" + code.intValue());
        }
    }

    /**
     * Set the code for this exception
     * @param code error code
     * @deprecated deprecated in 3.1.0, exceptions should be immutable, this
     * method should not be used
     */
    @Deprecated
    public void setCode(int code) {
        this.errorCode.set(Code.get(code));
    }

    /**
     * Legacy marker retained for compatibility.
     *
     * @deprecated since 3.1.0; use {@link Code}.
     */
    @Deprecated
    @InterfaceAudience.Public
    public interface CodeDeprecated {
    }

    private static final class CodeValues {
        private static final int OK_VALUE = 0;
        private static final int SYSTEM_ERROR = -1;
        private static final int RUNTIME_INCONSISTENCY = -2;
        private static final int DATA_INCONSISTENCY = -3;
        private static final int CONNECTION_LOSS = -4;
        private static final int MARSHALLING_ERROR = -5;
        private static final int UNIMPLEMENTED_VALUE = -6;
        private static final int OPERATION_TIMEOUT = -7;
        private static final int BAD_ARGUMENTS = -8;
        private static final int UNKNOWN_SESSION = -12;
        private static final int NEW_CONFIG_NO_QUORUM = -13;
        private static final int RECONFIG_IN_PROGRESS = -14;
        private static final int API_ERROR = -100;
        private static final int NO_NODE = -101;
        private static final int NO_AUTH = -102;
        private static final int BAD_VERSION = -103;
        private static final int NO_CHILDREN_FOR_EPHEMERALS = -108;
        private static final int NODE_EXISTS = -110;
        private static final int NOT_EMPTY = -111;
        private static final int SESSION_EXPIRED = -112;
        private static final int INVALID_CALLBACK = -113;
        private static final int INVALID_ACL = -114;
        private static final int AUTH_FAILED = -115;
        private static final int EPHEMERAL_ON_LOCAL_SESSION = -120;

        private CodeValues() {
        }
    }

    /** Codes which represent the various KeeperException
     * types. This enum replaces the deprecated earlier static final int
     * constants. The old, deprecated, values are in "camel case" while the new
     * enum values are in all CAPS.
     */
    @InterfaceAudience.Public
    public enum Code implements CodeDeprecated {
        /** Everything is OK */
        OK(CodeValues.OK_VALUE),

        /** System and server-side errors.
         * This is never thrown by the server, it shouldn't be used other than
         * to indicate a range. Specifically error codes greater than this
         * value, but lesser than {@link #APIERROR}, are system errors.
         */
        SYSTEMERROR(CodeValues.SYSTEM_ERROR),

        /** A runtime inconsistency was found */
        RUNTIMEINCONSISTENCY(CodeValues.RUNTIME_INCONSISTENCY),
        /** A data inconsistency was found */
        DATAINCONSISTENCY(CodeValues.DATA_INCONSISTENCY),
        /** Connection to the server has been lost */
        CONNECTIONLOSS(CodeValues.CONNECTION_LOSS),
        /** Error while marshalling or unmarshalling data */
        MARSHALLINGERROR(CodeValues.MARSHALLING_ERROR),
        /** Operation is unimplemented */
        UNIMPLEMENTED(CodeValues.UNIMPLEMENTED_VALUE),
        /** Operation timeout */
        OPERATIONTIMEOUT(CodeValues.OPERATION_TIMEOUT),
        /** Invalid arguments */
        BADARGUMENTS(CodeValues.BAD_ARGUMENTS),
        /** No quorum of new config is connected and up-to-date with the leader of last committed config - try
         *  invoking reconfiguration after new servers are connected and synced */
        NEWCONFIGNOQUORUM(CodeValues.NEW_CONFIG_NO_QUORUM),
        /** Another reconfiguration is in progress -- concurrent reconfigs not supported (yet) */
        RECONFIGINPROGRESS(CodeValues.RECONFIG_IN_PROGRESS),
        /** Unknown session (internal server use only) */
        UNKNOWNSESSION(CodeValues.UNKNOWN_SESSION),

        /** API errors.
         * This is never thrown by the server, it shouldn't be used other than
         * to indicate a range. Specifically error codes greater than this
         * value are API errors (while values less than this indicate a
         * {@link #SYSTEMERROR}).
         */
        APIERROR(CodeValues.API_ERROR),

        /** Node does not exist */
        NONODE(CodeValues.NO_NODE),
        /** Not authenticated */
        NOAUTH(CodeValues.NO_AUTH),
        /** Version conflict
         In case of reconfiguration: reconfig requested from config version X but last seen config has a different version Y */
        BADVERSION(CodeValues.BAD_VERSION),
        /** Ephemeral nodes may not have children */
        NOCHILDRENFOREPHEMERALS(CodeValues.NO_CHILDREN_FOR_EPHEMERALS),
        /** The node already exists */
        NODEEXISTS(CodeValues.NODE_EXISTS),
        /** The node has children */
        NOTEMPTY(CodeValues.NOT_EMPTY),
        /** The session has been expired by the server */
        SESSIONEXPIRED(CodeValues.SESSION_EXPIRED),
        /** Invalid callback specified */
        INVALIDCALLBACK(CodeValues.INVALID_CALLBACK),
        /** Invalid ACL specified */
        INVALIDACL(CodeValues.INVALID_ACL),
        /** Client authentication failed */
        AUTHFAILED(CodeValues.AUTH_FAILED),
        /** Session moved to another server, so operation is ignored */
        SESSIONMOVED(-118),
        /** State-changing request is passed to read-only server */
        NOTREADONLY(-119),
        /** Attempt to create ephemeral node on a local session */
        EPHEMERALONLOCALSESSION(CodeValues.EPHEMERAL_ON_LOCAL_SESSION),
        /** Attempts to remove a non-existing watcher */
        NOWATCHER(-121),
        /** Request not completed within max allowed time.*/
        REQUESTTIMEOUT(-122),
        /** Attempts to perform a reconfiguration operation when reconfiguration feature is disabled. */
        RECONFIGDISABLED(-123),
        /** The session has been closed by server because server requires client to do authentication
         *  with configured authentication scheme at the server, but client is not configured with
         *  required  authentication scheme or configured but authentication failed
         *  (i.e. wrong credential used.). */
        SESSIONCLOSEDREQUIRESASLAUTH(-124),
        /** Exceeded the quota that was set on the path.*/
        QUOTAEXCEEDED(-125),
        /** Operation was throttled and not executed at all. This error code indicates that zookeeper server
         *  is under heavy load and can't process incoming requests at full speed; please retry with back off.
         */
        THROTTLEDOP (-127);

        private static final Map<Integer, Code> lookup = new HashMap<>();

        static {
            for (Code c : EnumSet.allOf(Code.class)) {
                lookup.put(c.value, c);
            }
        }

        private final int value;
        Code(int value) {
            this.value = value;
        }

        /**
         * Get the int value for a particular Code.
         * @return error code as integer
         */
        public int intValue() {
            return value;
        }

        /**
         * Get the Code value for a particular integer error code
         * @param code int error code
         * @return Code value corresponding to specified int code, if null throws IllegalArgumentException
         */
        public static Code get(int code) {
            Code codeVal = lookup.get(code);
            if (codeVal == null) {
                throw new IllegalArgumentException("The current client version cannot lookup this code:" + code);
            }
            return codeVal;
        }
    }

    static String getCodeMessage(Code code) {
        switch (code) {
        case OK:
            return "ok";
        case SYSTEMERROR:
            return "SystemError";
        case RUNTIMEINCONSISTENCY:
            return "RuntimeInconsistency";
        case DATAINCONSISTENCY:
            return "DataInconsistency";
        case CONNECTIONLOSS:
            return "ConnectionLoss";
        case MARSHALLINGERROR:
            return "MarshallingError";
        case NEWCONFIGNOQUORUM:
            return "NewConfigNoQuorum";
        case RECONFIGINPROGRESS:
            return "ReconfigInProgress";
        case UNIMPLEMENTED:
            return "Unimplemented";
        case OPERATIONTIMEOUT:
            return "OperationTimeout";
        case BADARGUMENTS:
            return "BadArguments";
        case APIERROR:
            return "APIError";
        case NONODE:
            return "NoNode";
        case NOAUTH:
            return "NoAuth";
        case BADVERSION:
            return "BadVersion";
        case NOCHILDRENFOREPHEMERALS:
            return "NoChildrenForEphemerals";
        case NODEEXISTS:
            return "NodeExists";
        case INVALIDACL:
            return "InvalidACL";
        case AUTHFAILED:
            return "AuthFailed";
        case NOTEMPTY:
            return "Directory not empty";
        case SESSIONEXPIRED:
            return "Session expired";
        case INVALIDCALLBACK:
            return "Invalid callback";
        case SESSIONMOVED:
            return "Session moved";
        case NOTREADONLY:
            return "Not a read-only call";
        case EPHEMERALONLOCALSESSION:
            return "Ephemeral node on local session";
        case NOWATCHER:
            return "No such watcher";
        case RECONFIGDISABLED:
            return "Reconfig is disabled";
        case SESSIONCLOSEDREQUIRESASLAUTH:
            return "Session closed because client failed to authenticate";
        case QUOTAEXCEEDED:
            return "Quota has exceeded";
        case THROTTLEDOP:
            return "Op throttled due to high load";
        default:
            return "Unknown error " + code;
        }
    }

    private final AtomicReference<Code> errorCode;

    private final AtomicReference<String> path;

    protected KeeperException(Code code) {
        this(code, null);
    }

    protected KeeperException(Code code, String path) {
        this.errorCode = new AtomicReference<>(code);
        this.path = new AtomicReference<>(path);
    }

    /**
     * Read the error code for this exception
     * @return the error code for this exception
     * @deprecated deprecated in 3.1.0, use {@link #code()} instead
     */
    @Deprecated
    public int getCode() {
        return errorCode.get().intValue();
    }

    /**
     * Read the error Code for this exception
     * @return the error Code for this exception
     */
    public Code code() {
        return errorCode.get();
    }

    /**
     * Read the path for this exception
     * @return the path associated with this error, null if none
     */
    public String getPath() {
        return path.get();
    }

    @Override
    public String getMessage() {
        if (path.get() == null || path.get().isEmpty()) {
            return "KeeperErrorCode = " + getCodeMessage(errorCode.get());
        }
        return "KeeperErrorCode = " + getCodeMessage(errorCode.get()) + " for " + path.get();
    }

    void setMultiResults(List<OpResult> results) {
        this.results.set(results);
    }

    /**
     * If this exception was thrown by a multi-request then the (partial) results
     * and error codes can be retrieved using this getter.
     * @return A copy of the list of results from the operations in the multi-request.
     *
     * @since 3.4.0
     *
     */
    public List<OpResult> getResults() {
        List<OpResult> currentResults = results.get();
        return currentResults != null ? new ArrayList<OpResult>(currentResults) : null;
    }

    /**
     *  @see Code#APIERROR
     */
    @InterfaceAudience.Public
    public static class APIErrorException extends KeeperException {

        public APIErrorException() {
            super(Code.APIERROR);
        }

    }

    /**
     *  @see Code#AUTHFAILED
     */
    @InterfaceAudience.Public
    public static class AuthFailedException extends KeeperException {

        public AuthFailedException() {
            super(Code.AUTHFAILED);
        }

    }

    /**
     *  @see Code#BADARGUMENTS
     */
    @InterfaceAudience.Public
    public static class BadArgumentsException extends KeeperException {

        public BadArgumentsException() {
            super(Code.BADARGUMENTS);
        }
        public BadArgumentsException(String path) {
            super(Code.BADARGUMENTS, path);
        }

    }

    /**
     * @see Code#BADVERSION
     */
    @InterfaceAudience.Public
    public static class BadVersionException extends KeeperException {

        public BadVersionException() {
            super(Code.BADVERSION);
        }
        public BadVersionException(String path) {
            super(Code.BADVERSION, path);
        }

    }

    /**
     * @see Code#CONNECTIONLOSS
     */
    @InterfaceAudience.Public
    public static class ConnectionLossException extends KeeperException {

        public ConnectionLossException() {
            super(Code.CONNECTIONLOSS);
        }

    }

    /**
     * @see Code#DATAINCONSISTENCY
     */
    @InterfaceAudience.Public
    public static class DataInconsistencyException extends KeeperException {

        public DataInconsistencyException() {
            super(Code.DATAINCONSISTENCY);
        }

    }

    /**
     * @see Code#INVALIDACL
     */
    @InterfaceAudience.Public
    public static class InvalidACLException extends KeeperException {

        public InvalidACLException() {
            super(Code.INVALIDACL);
        }
        public InvalidACLException(String path) {
            super(Code.INVALIDACL, path);
        }

    }

    /**
     * @see Code#INVALIDCALLBACK
     */
    @InterfaceAudience.Public
    public static class InvalidCallbackException extends KeeperException {

        public InvalidCallbackException() {
            super(Code.INVALIDCALLBACK);
        }

    }

    /**
     * @see Code#MARSHALLINGERROR
     */
    @InterfaceAudience.Public
    public static class MarshallingErrorException extends KeeperException {

        public MarshallingErrorException() {
            super(Code.MARSHALLINGERROR);
        }

    }

    /**
     * @see Code#NOAUTH
     */
    @InterfaceAudience.Public
    public static class NoAuthException extends KeeperException {

        public NoAuthException() {
            super(Code.NOAUTH);
        }

    }

    /**
     * @see Code#NEWCONFIGNOQUORUM
     */
    @InterfaceAudience.Public
    public static class NewConfigNoQuorum extends KeeperException {

        public NewConfigNoQuorum() {
            super(Code.NEWCONFIGNOQUORUM);
        }

    }

    /**
     * @see Code#RECONFIGINPROGRESS
     */
    @InterfaceAudience.Public
    public static class ReconfigInProgress extends KeeperException {

        public ReconfigInProgress() {
            super(Code.RECONFIGINPROGRESS);
        }

    }

    /**
     * @see Code#NOCHILDRENFOREPHEMERALS
     */
    @InterfaceAudience.Public
    public static class NoChildrenForEphemeralsException extends KeeperException {

        public NoChildrenForEphemeralsException() {
            super(Code.NOCHILDRENFOREPHEMERALS);
        }
        public NoChildrenForEphemeralsException(String path) {
            super(Code.NOCHILDRENFOREPHEMERALS, path);
        }

    }

    /**
     * @see Code#NODEEXISTS
     */
    @InterfaceAudience.Public
    public static class NodeExistsException extends KeeperException {

        public NodeExistsException() {
            super(Code.NODEEXISTS);
        }
        public NodeExistsException(String path) {
            super(Code.NODEEXISTS, path);
        }

    }

    /**
     * @see Code#NONODE
     */
    @InterfaceAudience.Public
    public static class NoNodeException extends KeeperException {

        public NoNodeException() {
            super(Code.NONODE);
        }
        public NoNodeException(String path) {
            super(Code.NONODE, path);
        }

    }

    /**
     * @see Code#NOTEMPTY
     */
    @InterfaceAudience.Public
    public static class NotEmptyException extends KeeperException {

        public NotEmptyException() {
            super(Code.NOTEMPTY);
        }
        public NotEmptyException(String path) {
            super(Code.NOTEMPTY, path);
        }

    }

    /**
     * @see Code#OPERATIONTIMEOUT
     */
    @InterfaceAudience.Public
    public static class OperationTimeoutException extends KeeperException {

        public OperationTimeoutException() {
            super(Code.OPERATIONTIMEOUT);
        }

    }

    /**
     * @see Code#RUNTIMEINCONSISTENCY
     */
    @InterfaceAudience.Public
    public static class RuntimeInconsistencyException extends KeeperException {

        public RuntimeInconsistencyException() {
            super(Code.RUNTIMEINCONSISTENCY);
        }

    }

    /**
     * @see Code#SESSIONEXPIRED
     */
    @InterfaceAudience.Public
    public static class SessionExpiredException extends KeeperException {

        public SessionExpiredException() {
            super(Code.SESSIONEXPIRED);
        }

    }

    /**
     * @see Code#UNKNOWNSESSION
     */
    @InterfaceAudience.Public
    public static class UnknownSessionException extends KeeperException {

        public UnknownSessionException() {
            super(Code.UNKNOWNSESSION);
        }

    }

    /**
     * @see Code#SESSIONMOVED
     */
    @InterfaceAudience.Public
    public static class SessionMovedException extends KeeperException {

        public SessionMovedException() {
            super(Code.SESSIONMOVED);
        }

    }

    /**
     * @see Code#NOTREADONLY
     */
    @InterfaceAudience.Public
    public static class NotReadOnlyException extends KeeperException {

        public NotReadOnlyException() {
            super(Code.NOTREADONLY);
        }

    }

    /**
     * @see Code#EPHEMERALONLOCALSESSION
     */
    @InterfaceAudience.Public
    public static class EphemeralOnLocalSessionException extends KeeperException {

        public EphemeralOnLocalSessionException() {
            super(Code.EPHEMERALONLOCALSESSION);
        }

    }

    /**
     * @see Code#SYSTEMERROR
     */
    @InterfaceAudience.Public
    public static class SystemErrorException extends KeeperException {

        public SystemErrorException() {
            super(Code.SYSTEMERROR);
        }

    }

    /**
     * @see Code#UNIMPLEMENTED
     */
    @InterfaceAudience.Public
    public static class UnimplementedException extends KeeperException {

        public UnimplementedException() {
            super(Code.UNIMPLEMENTED);
        }

    }

    /**
     * @see Code#NOWATCHER
     */
    @InterfaceAudience.Public
    public static class NoWatcherException extends KeeperException {

        public NoWatcherException() {
            super(Code.NOWATCHER);
        }

        public NoWatcherException(String path) {
            super(Code.NOWATCHER, path);
        }

    }

    /**
     * @see Code#RECONFIGDISABLED
     */
    @InterfaceAudience.Public
    public static class ReconfigDisabledException extends KeeperException {

        public ReconfigDisabledException() {
            super(Code.RECONFIGDISABLED);
        }
        public ReconfigDisabledException(String path) {
            super(Code.RECONFIGDISABLED, path);
        }

    }

    /**
     * @see Code#SESSIONCLOSEDREQUIRESASLAUTH
     */
    public static class SessionClosedRequireAuthException extends KeeperException {

        public SessionClosedRequireAuthException() {
            super(Code.SESSIONCLOSEDREQUIRESASLAUTH);
        }
        public SessionClosedRequireAuthException(String path) {
            super(Code.SESSIONCLOSEDREQUIRESASLAUTH, path);
        }

    }

    /**
     * @see Code#REQUESTTIMEOUT
     */
    public static class RequestTimeoutException extends KeeperException {

        public RequestTimeoutException() {
            super(Code.REQUESTTIMEOUT);
        }

    }

    /**
     * @see Code#QUOTAEXCEEDED
     */
    @InterfaceAudience.Public
    public static class QuotaExceededException extends KeeperException {
        public QuotaExceededException() {
            super(Code.QUOTAEXCEEDED);
        }
        public QuotaExceededException(String path) {
            super(Code.QUOTAEXCEEDED, path);
        }
    }

    /**
     * @see Code#THROTTLEDOP
     */
    public static class ThrottledOpException extends KeeperException {
        public ThrottledOpException() {
            super(Code.THROTTLEDOP);
        }
    }
}
