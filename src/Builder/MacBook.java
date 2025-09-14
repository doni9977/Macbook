package Builder;

public class MacBook {
    private final String model;
    private final String cpu;
    private final int ram;
    private final int storage;
    private final String color;

    private MacBook(Builder builder){
        this.model = builder.model;
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.color = builder.color;
    }

    public String getModel() { return model; }
    public String geCpu() { return cpu; }
    public int gerRam() { return ram; }
    public int storage() { return storage; }

    @Override
    public String toString(){
        return "MacBook {" +
                "model= '" + model + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram=" + ram + "GB" +
                ", storage=" + storage + "GB" +
                ", color='" + color +  '\'' + '}';
    }

    public static class Builder {
        private String model;
        private String cpu;
        private int ram;
        private int storage;
        private String color;

        public Builder withModel(String model){
            this.model = model;
            return this;
        }

        public Builder withCpu(String cpu){
            this.cpu = cpu;
            return this;
        }

        public Builder withRam(int ram){
            this.ram = ram;
            return this;
        }
        public Builder withStrage(int storage){
            this.storage = storage;
            return this;
        }
        public Builder withColor(String color){
            this.color = color;
            return this;
        }
        public MacBook build(){
            return new MacBook(this);
        }
    }
}
