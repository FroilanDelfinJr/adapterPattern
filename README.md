## Programming Challenge

Plugging Devices into Power Outlets

You are developing an application that helps users manage and control various electronic devices by plugging them into power outlets. Each device has different plug types, voltage, and amperage requirements. To ensure compatibility and safety, you need to create adapters for different devices to allow them to be plugged into standard power outlets.

<ul>
  <li>Adaptee Objects:</li>
  <br>
    <ul>
      <li>Laptop - Represents a laptop device that needs to be plugged into a power source. It has the charge() method.</li>
      <li>Refrigerator - Represents a refrigerator device that requires a power source. It has the startCooling() method.</li>
      <li>SmartphoneCharger - Represents a smartphone charger that needs to be plugged in for charging. It has the chargePhone() method.</li>
    </ul>
  <br>
  <li>Target Object:</li>
  <br>
    <ul>
      <li>PowerOutlet - Represents a standard power outlet with a common interface for plugging in devices. It defines the plugIn() method as the target method.</li>
    </ul>
  <br>
  <li>Adapter Objects:</li>
  <br>
    <ul>
      <li>LaptopAdapter - An adapter for plugging a laptop into a standard power outlet. It adapts the Laptop to the PowerOutlet interface, translating plugIn() to charge().</li>
      <li>RefrigeratorAdapter - An adapter for plugging a refrigerator into a standard power outlet. It adapts the Refrigerator to the PowerOutlet interface, translating plugIn() to startCooling().
</li>
      <li>SmartphoneAdapter - An adapter for plugging a smartphone charger into a standard power outlet. It adapts the SmartphoneCharger to the PowerOutlet interface, translating plugIn() to chargePhone().</li>
    </ul>
  <br>
</ul>

## UML Class Diagram

![Class Diagram](https://github.com/FroilanDelfinJr/adapterPattern/assets/142400742/9d67ff45-670d-4d21-ad3f-284cb87f3cf3)


