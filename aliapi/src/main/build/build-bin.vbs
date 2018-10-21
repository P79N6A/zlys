Set fso = Wscript.CreateObject("Scripting.FileSystemObject")
Set args = wscript.arguments
msgbox args.count
set f=fso.opentextfile("D:\workspaces\zlys\aliapi\src\main\build/" & "../bin/start.sh")
s=replace(f.readall,"${project.finalName}", project)'
f.close
set r=fso.opentextfile("../bin/start.sh",2,true)
r.write s
Wscript.quit