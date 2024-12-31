class House {
    private String foundation;
    private String structure;
    private String roof;

    // Builder Class
    static class Builder {
        private String foundation;
        private String structure;
        private String roof;

        public Builder setFoundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        public Builder setStructure(String structure) {
            this.structure = structure;
            return this;
        }

        public Builder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public House build() {
            House house = new House();
            house.foundation = this.foundation;
            house.structure = this.structure;
            house.roof = this.roof;
            return house;
        }
    }

    @Override
    public String toString() {
        return "House [foundation=" + foundation + ", structure=" + structure + ", roof=" + roof + "]";
    }
}

public class BuilderPattern {
    public static void main(String[] args) {
        House house = new House.Builder()
                .setFoundation("Concrete")
                .setStructure("Wooden")
                .setRoof("Tiles")
                .build();

        System.out.println(house);
    }
}
