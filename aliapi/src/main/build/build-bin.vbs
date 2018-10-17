Set args = WScript.Arguments
MsgBox args
Set project = args(0)
Set fso = Wscript.CreateObject("Scripting.FileSystemObject")
set f=fso.opentextfile(createobject("Scripting.FileSystemObject").GetFolder(".").Path & "../bin/start.sh")
s=replace(f.readall,"${project.finalName}", project)'
f.close
set r=fso.opentextfile("../bin/start.sh",2,true)
r.write s
Wscript.quit