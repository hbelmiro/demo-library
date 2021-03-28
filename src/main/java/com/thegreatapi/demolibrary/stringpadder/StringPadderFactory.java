package com.thegreatapi.demolibrary.stringpadder;

/**
 * Factory for creating instances of {@link StringPadder}.
 */
public final class StringPadderFactory {

    /**
     * Creates an instance of {@link StringPadder}.
     *
     * @return the new instance
     */
    public StringPadder createStringPadder() {
        return new StringPadderImpl();
    }

}
