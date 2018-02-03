package com.mechner.logging;

/**
 * Top level logging interface.
 *
 * Logging support some standard features:
 * <li>Timestamp in several formats, e.g. ISO-8601 and variants. Timestamp based on a TimeSource.</li>
 * <li>Log level: error, warn, info, and debug.</li>
 * <li>Message generation based on pattern, e.g. log("Wrong id. expected = {}. actual = {}.").addInt(10).addInt(10);</li>
 *
 * The implementation supports fast, synchronous, thread-unsafe, zero-garbage logging.
 * We support multiple loggers in an application, e.g. one for local disk and one for a log bus.
 *
 * We don't support in-app filtering or lazy logging based on configured log level.
 * We don't support automatic class or line logging.
 *
 * The basic pattern is:
 * <pre>{@code
 * Logger.setTimeSource(timeSource);
 * Logger.setTimestampFormat(ISO8601);
 *
 * Logger logger = (get logger);
 * logger.log("Hello.");
 * logger.log("I expected {} but got {}").addInt(
 *
 * }</pre>
 *
 */
public interface Logger {

    public void log(CharSequence message);

    public void log(CharSequence message, CharSequence p1);

}
