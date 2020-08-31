class CustomString {
    public String s;
    CustomString(String s) {
        this.s = s;
    }
    // it adds particular functionality to the same function
    // defined in the super
    @Override
    public boolean equals(Object other) {
         // other is the object with which we are comparing the "this" object

        // The other object is not even the same CustomString type
        if (!(other instanceof CustomString)) return false;

        // If the code execution ever comes here it means that
        // the other object is of type CustomString
        CustomString otherCustomString = (CustomString) other;

        // both of them refers to same object in memory
        if (otherCustomString == this) return true; 

        // the other object is 

        // The other object is of CustomString type but their Strings s 
        // are of varying length
        if (otherCustomString.s.length() != this.s.length()) return false;
        System.out.println("reached here");

        for (int i=0;i < otherCustomString.s.length();i++) {
            if (otherCustomString.s.charAt(i) != this.s.charAt(i)) return false;
        }
        System.out.println("equals");
        return true;
    }
}

// If you create CustomString s= new CustomString("String")
//CustomString p = new CustomString("etfvs")
// p==s => p.equals(s)

// equals method was defined in Object class, String class and in
// CustomString class
// if a variable p is of CustomString class type it will only have 
// access to the equals method defined in CustomString class
