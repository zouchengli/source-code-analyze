package site.clzblog.source.code.analyze.spring.annotation.entity;

public class ImportUserEntity {
    private String id;
    private String name;

    public ImportUserEntity() {
    }

    public ImportUserEntity(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ImportUserEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
