package com.ecommerce;



public class OS5 {

        private long OSID;
        private String name;
        
        public OS5() {
                
        }
        public OS5(String name) {
                this.OSID = 0;
                this.name = name;
        }
        
        public long getOSID() {return this.OSID; }
        public String getName() { return this.name;}
        public void setOSID(long id) { this.OSID = id;}
        public void setName(String name) { this.name= name;}
        
        
}