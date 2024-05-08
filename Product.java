
    //java bean class
//no arrugumt and argumt
//
    public class Product
    {
        private int pid;
        private String pname;
        private double price;
        private String company;
        private int qut;

        public Product() {
        }

        /**
         *
         * @param pid
         * @param pname
         * @param price
         * @param company
         * @param qut
         */
        public Product(int pid, String pname, double price, String company, int qut) {
            this.pid = pid;
            this.pname = pname;
            this.price = price;
            this.company = company;
            this.qut = qut;
        }


//    public String toString() {
//        return "pid : " + this.pid +
//                "\n pname : " + this.pname+
//                "\n price : " + this.price+
//                "\n company : " + this.company+
//                "\n qut : " + this.qut;
//    }

        public int getPid() {
            return pid;
        }

        public String getPname() {
            return pname;
        }

        public double getPrice() {
            return price;
        }

        public String getCompany() {
            return company;
        }

        public int getQut() {
            return qut;
        }

        public void setPid(int pid) {
            this.pid = pid;
        }

        public void setPname(String pname) {
            this.pname = pname;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public void setQut(int qut) {
            this.qut = qut;
        }

    }
