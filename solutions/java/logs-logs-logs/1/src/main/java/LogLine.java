public class LogLine {
    private final String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        if (logLine.length() < 5) return LogLevel.UNKNOWN;
        String levelCode = logLine.substring(1, 4);
        return switch (levelCode) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        LogLevel level = getLogLevel();
        String message = logLine.substring(logLine.indexOf("]: ") + 3);
        return level.getCode() + ":" + message;
    }
}