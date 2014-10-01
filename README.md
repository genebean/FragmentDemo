# Fragemnt Demo

This repo has a sample application that shows the flexibility of using fagments 
as part of an Android application. Below is a tutorial on how to utilize the 
sample code and also how to recreate it on your own.

## Version

1.0 - Working app with one known bug.

## Bugs

- When text has been entered and sent to the second fragment and then the screen 
  is rotated the text on the second fagment is reset.

## Installing for development / testing

This code was written in Eclipse and includes a `.project` file. All testing was 
done using Genymotion with a Samsung S5 and a Google Nexux 7 tablet as targets. 
Follow the instructions below to get it into your copy of Eclipse:

```sh
# If using Git:
cd Downloads # or some other directory
git clone https://github.com/genebean/FragmentDemo.git  
cd fragmentdemo

```

If you are not using git or just want to grab a copy by hand then you can do so by 
going to https://github.com/genebean/FragmentDemo/archive/master.zip 
This will download a copy of the repository in ZIP format. 
You will want to unzip it before moving on to the next step.

Now you can open Ecliipse and go to `File -> Import...` and select 
`Android -> Existing Android Code into Workspace`. At this point you should be able 
to launce the sample program in an emulator.

## Using FagmentDemo

Once the application is running you will see that there are two different sections 
differentiated by color on the screen. Each color represents the entiritey of a 
single fragment. If you enter text in the box of the first fragment and press the 
`Submit` button you will see it replace a line of text in the second fragment.

If you review the code in your editor or on GitHub you will see that there are 
three activities with corresponding layouts. You will also see that there are files 
in values being utilized: `strings.xml` and `colors.xml`. All the code that is not 
purely stock from when the files were created by Ecliplse has been commented to 
help explain what is going on.

## A Step-by-Step Tutorial

[Tutorial.md](./Tutorial.md)

### *Giving credit where it's due:*
*This README was created using the awesome http://dillinger.io online editor*
