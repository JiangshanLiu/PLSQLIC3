package com.myplugin.plsqlic3.backend.parsers.parseplpgsql;

/**
 * To distinguish between different actions in case of parser errors
 * Several different error handling states have been designed
 */
public enum ERROR_MODE {
    DEFAULT,
    IGNORE,
    EXCEPTION
}
