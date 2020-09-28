package com.umctec.code.challenge.enumeration;

public enum FilterCardType {
    PRIORITY("All cards"),
    TO_RECEIVE("Only cards with documents not received"),
    TO_SEND("Only cards with all documents received, checklists done and no open pendency");

    FilterCardType(final String filter) {}
}
