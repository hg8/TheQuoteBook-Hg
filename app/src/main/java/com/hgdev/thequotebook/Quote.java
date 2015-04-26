package com.hgdev.thequotebook;

/**
 * Created by hugo on 26/04/15.
 */
public class Quote {

    public String person;
    public String quote;

    public Quote(String p_Quote, String p_person)
    {
        super();
        quote = p_Quote;
        person = p_person;
    }

    public String getPerson() {
        return person;
    }

    public String getQuote() {
        return quote;
    }
}
