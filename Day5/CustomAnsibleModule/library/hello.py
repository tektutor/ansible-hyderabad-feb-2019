#!/usr/bin/python

from ansible.module_utils.basic import AnsibleModule

def sayHello(msg):
    return "Hello " + msg 

def main():
    module = AnsibleModule ( argument_spec = dict ( name = dict ( type='str' ) ) )

    arg = module.params['name']

    output = dict ( message =  sayHello( arg ) )
  
    module.exit_json ( **output )

main()
