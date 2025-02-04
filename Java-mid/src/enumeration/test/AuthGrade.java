package enumeration.test;

public enum AuthGrade {
    GUEST("손님", 1), LOGIN("로그인 회원", 2), ADMIN("관리자", 3);
    private final String description;
    private final int level;

    AuthGrade(String description, int level) {
        this.description = description;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }
}
