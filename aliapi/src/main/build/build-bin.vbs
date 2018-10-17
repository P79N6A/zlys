Set args = WScript.Arguments

Set fso = Wscript.CreateObject("Scripting.FileSystemObject")
set f=fso.opentextfile("../bin/start.sh")
s=replace(f.readall,"${${project.finalName}}","$1")'
f.close
set r=fso.opentextfile("../bin/start.sh",2,true)
r.write s
Wscript.quit