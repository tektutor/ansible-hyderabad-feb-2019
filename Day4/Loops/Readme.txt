You can use the retry to file to restrict the playbook execution only to the failed machines listed in the retry file as shown below

ansible-playbook list.yml --limit @list.retry
