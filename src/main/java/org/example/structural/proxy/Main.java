package org.example.structural.proxy;

/*
    Proxy is a structural design pattern that provides an object that acts as a substitute
    for a real service object used by a client.
    A proxy receives client requests, does some work (access control, caching, etc.) and
    then passes the request to a service object.
    When to use the Proxy pattern:
    - When we want a simplified version of a complex or heavy object.
    - When the original object is present in different address space, and we want to represent it locally.
    - When we want to add a layer of security to the original underlying object to
      provide controlled access based on access rights of the client.
 */
public class Main {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage();
        ImageDto realImageDto = proxyImage.loadImage("example.jpg");
        ImageDto proxyImageDto = proxyImage.loadImage("example.jpg");

        System.out.println("Is realImageDto equal to proxyImageDto: " + realImageDto.equals(proxyImageDto));
    }
}
