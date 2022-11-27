package constant;

public enum RegexConstant {
    EMAIL("^\\w+(@gmail\\.com)$"),
    PASSWORD("(?=.*[A-Z])(?=.*[. , - _ ;]).{7,15}");

    public String value;
    RegexConstant(String value){this.value = value;}
}
