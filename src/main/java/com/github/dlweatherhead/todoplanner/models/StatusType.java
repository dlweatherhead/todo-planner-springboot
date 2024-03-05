package com.github.dlweatherhead.todoplanner.models;

public enum StatusType {
    BACKLOG, DOING, DONE;

    public StatusType getNextStatus() {
        if (this == StatusType.BACKLOG) {
            return StatusType.DOING;
        } else if (this == StatusType.DOING) {
            return StatusType.DONE;
        }

        return this;
    }
}
