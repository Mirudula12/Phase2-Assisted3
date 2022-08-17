package com.ecommerce;


import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.Map;


public class EProduct6 {
        private long ID;
        private String name;
        private BigDecimal price;
        private Date dateAdded;
        private List<Color6> colors;
        private Collection<ScreenSizes6> screenSizes;
        private Set<OS6> os;
        private Map finance;
        
        public EProduct6() {
                
        }
        
        public long getID() {return this.ID; }
        public String getName() { return this.name;}
        public BigDecimal getPrice() { return this.price;}
        public Date getDateAdded() { return this.dateAdded;}
        public List<Color6> getColors() { return this.colors;}
        public Collection<ScreenSizes6> getScreensizes() { return this.screenSizes;}
        public Set<OS6> getOs() { return this.os;}
        public Map getFinance() { return this.finance;}
        
        public void setID(long id) { this.ID = id;}
        public void setName(String name) { this.name = name;}
        public void setPrice(BigDecimal price) { this.price = price;}
        public void setDateAdded(Date date) { this.dateAdded = date;}
        public void setColors(List<Color6> colors) { this.colors = colors;}
        public void setScreensizes(Collection<ScreenSizes6> sizes) { this.screenSizes = sizes;}
        public void setOs(Set<OS6> os) { this.os = os;}
        public void setFinance(Map finance) { this.finance = finance;}
}