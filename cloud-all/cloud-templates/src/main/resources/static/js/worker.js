�}  I  �^b���La���	Q؆+�e�~��V�'� �vp�uҟ]DuJ��X�a�B�X�x��;XF
���*�۝��to �n��.syV;�U%6�`z8�}�����Cg�πw)��]����M�B'�?D�g��nFX�������ivV�|9�Bm�k-C9ET���Fcx����Z���B7h+���G��C�Oe��PW(��v[�kߗC�-;�7c�ۤs͇��,g�d���B�vb G��94j���/{&Z@i��|)��-T�Y䴢񰢳��ǀ�糒g�aeT)�~-�ΟF�� N���z��%��6�/�|Aw�h�S�R?F�zw5�����"��]ܦz��k�l��={73���?Q�i_w�&jΈ+�i��{+�i;b�䚈{��
������|��{�G"��?�(�@�Y^�Y�#��c�g"�����:��ʴi=p��pZņt�ʾ��@&2A�,����hm9�z��7ɱNݢ=   };

    var encode = function(arrayBuffer){
        samplesMono = convertBuffer(arrayBuffer);
        self.postMessage({
            cmd: 'pcm',
            buf: samplesMono
        });
    };

  self.onmessage = function(e){
    switch(e.data.cmd){
      case 'encode':
        encode(e.data.buf);
        break;
    }
  };
})();
