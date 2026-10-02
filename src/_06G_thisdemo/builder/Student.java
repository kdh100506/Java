package _06G_thisdemo.builder;

public class Student {
    private int id;
    private String name;
    private int grade;
    private String major;
    private String phoneNumber;

    public class Builder {
        private int id;
        private String name;
        private int grade;
        private String major;
        private String phoneNumber;

        public Builder(int id, String name, int grade, String major, String phoneNumber) {
            this.id = id;
            this.name = name;
            this.grade =grade;
        }

        public Builder getMajor(String major) {
            this.major = major;
            return this;
        }

        public Builder getPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
    }
}
