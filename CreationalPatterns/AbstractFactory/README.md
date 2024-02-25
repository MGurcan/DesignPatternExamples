# Creational Pattern
## Abstract Factory
---

### Abstract Products
declare interfaces for a set of distinct but related products which make up a product family.

`public interface Button {
    void paint();
}`

`public interface Checkbox {
    void paint();
}`

### Concrete Products
Concrete Products are various implementations of abstract products

    public class MacOSButton implements Button{
        public void paint() {
            System.out.println("You have created MacOSButton.");
        }
    }

### Abstract Factory
The Abstract Factory interface declares a set of methods for creating each of the abstract products.
    
    public interface GUIFactory {
        Button createButton();
        Checkbox createCheckbox();
    }

### Concrete Factory
Concrete Factories implement creation methods of the abstract factory.

    public class MacOSFactory implements GUIFactory {
        @Override
        public Button createButton() {
            return new MacOSButton();
        }
        @Override
        public Checkbox createCheckbox() {
            return new MacOSCheckbox();
        }
    }
