package org.example.ZOHO;

import org.example.ZOHO.Questions.Maths;
import org.example.ZOHO.Questions.OneDimensionArray;
import org.example.ZOHO.Questions.PatternPrinting;

public class ZOHO_QUESTIONS {

    PatternPrinting patternPrinting = new PatternPrinting();
    OneDimensionArray oneDimensionArray = new OneDimensionArray();
    Maths maths = new Maths();

    public PatternPrinting getPatternPrinting() {
        return patternPrinting;
    }

    public OneDimensionArray getOneDimensionArray() {
        return oneDimensionArray;
    }

    public Maths getMaths() {
        return maths;
    }
}
