public class Employee {
    private String socialSecurityNumber;
    private Boolean gender;
    private String dateOfBirth;

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public Boolean getGender() {
        return gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
